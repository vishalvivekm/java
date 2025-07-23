package main

func maximumSubarraySum(nums []int, k int) int64 {

	sum := 0

	maxM := 0

	i, j := 0, 0

	mp := make(map[int]int)

	for j < len(nums) {

		val, ok := mp[nums[j]]

		if ok {

			mp[nums[j]] = val + 1

		} else {

			mp[nums[j]] = 1

		}

		sum += nums[j]

		if j-i+1 == k {

			if len(mp) == k {

				maxM = max(sum, maxM)

			}

			sum -= nums[i]

			count, _ := mp[nums[i]]

			if count == 1 {

				delete(mp, nums[i])

			} else {

				mp[nums[i]] = count - 1

			}

			i++

		}

		j++

	}

	return int64(maxM)

}
