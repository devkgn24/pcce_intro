package day02;

public class Run {

	public static void main(String[] args) {
		Solution03 s3 = new Solution03();
		// 배열을 매개변수로 사용하는 법(1)
		int[] nums = {1, 2, 3, 4, 5};
		s3.solution(nums);
		// 배열을 매개변수로 사용하는 법(2)
		int[] num2 = new int[] {1,2,3,4,5};
		s3.solution(new int[] {1, 2, 100, -99, 1, 2, 3});
	}

}
