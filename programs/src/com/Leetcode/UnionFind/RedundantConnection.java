// LC 684

class Solution {

class DisjointSet {
	List<Integer> rank = new ArrayList<>();
	List<Integer> parent = new ArrayList<>();

	public DisjointSet(int n){
		for(int i = 0; i <= n; i++){
			rank.add(0);
			parent.add(i);
		}
	}

	public int findUPar(int node){
		if( node == parent.get(node)){
			return node;
		}

		int ulp = findUPar(parent.get(node));
		parent.set(node, ulp);
		return parent.get(node);
	}

	public void unionByRank(int u, int v){
		int ulp_u = findUPar(u);
		int ulp_v = findUPar(v);

		if(ulp_u == ulp_v)return ;

		if(rank.get(ulp_u) < rank.get(ulp_v)){
			parent.set(ulp_u, ulp_v);
		} else if(rank.get(ulp_v) < rank.get(ulp_u)){
			parent.set(ulp_v, ulp_u);
		} else {
			parent.set(ulp_v, ulp_u);
			int rankU = rank.get(ulp_u);
			rank.set(ulp_u, rankU + 1);
		}

	}
}


    public int[] findRedundantConnection(int[][] edges) {
       int n  = edges.length;
        DisjointSet ds = new DisjointSet(n);
                for(int[] edge: edges){
                    if(ds.findUPar(edge[0]) == ds.findUPar(edge[1])){
                        return new int[]{edge[0], edge[1]};
                    }
                     ds.unionByRank(edge[0], edge[1]);

                }
    return new int[]{0,0};

    }
}
