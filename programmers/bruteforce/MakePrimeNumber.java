public class MakePrimeNumber {
    class Solution {
        public int solution(int[] nums) {
            int answer = 0;

            for (int i = 0; i < nums.length - 2; i++) {
                for (int j = i+1; j < nums.length - 1; j++) {
                    for (int p = j+1; p < nums.length; p++) {
                        // 출력 디버그
                        //System.out.printf("%d %d %d 조합은 테스트 중이다.\n", nums[i], nums[j], nums[p]);

                        // 소수판별 로직
                        int sum = nums[i] + nums[j] + nums[p];
                        int count = 0;

                        for (int q = 1; q <= sum; q++) {
                            if ((sum % q) == 0) {
                                count += 1;
                            }

                            if (count > 2) {
                                break;
                            }
                        }

                        if (count == 2) {
                            answer += 1;
                        }

                        // 출력 디버그
                        //System.out.printf("%d %d %d 조합은 소수이다.\n", nums[i], nums[j], nums[p]);
                    }
                }
            }



            return answer;
        }
    }
}
