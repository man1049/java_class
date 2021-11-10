package naver.man10_49.Practice;

public class Practice_7 {

	public static void main(String[] args) {
		//음양 더하기
		//어떤 정수들이 있습니다. 이 정수들의 절댓값을 차례대로 담은
		//정수 배열 absolutes와 이 정수들의 부호를 차례대로 담은 불리언 배열 
		//signs가 매개변수로 주어집니다.
		//실제 정수들의 합을 구하여 return 하도록 solution 함수를 완성해주세요.
		// true일경우 양수 false일경우 음수
		int[] absolutes = {4,7,12};
		boolean[] signs = {true,false,true};
		
		int answer = 0;
		
        for(int i = 0 ; i < absolutes.length ; i = i +1){
            if (signs[i] == true){
                answer = answer + absolutes[i];
            }else{
                answer = answer + (absolutes[i]*-1);
            }
        }
	}

}
