package naver.man10_49.Practice;

public class Practice_4 {

	public static void main(String[] args) {
		
		//////////////////////////////////////////////////
		//모두 String 클래스에서 length()와 charAt()만 사용하기//
		
		//HelloWorld를 모두 대문자로 출력
		String hw = "HelloWorld";
		//toUpperCase()는 모두 대문자로 바꿔줌
		System.out.print(hw.toUpperCase());
		
		
		
		System.out.print("\n\n\n");

		/////////////////////////////////////////
		//"Hello World" 에서 중간 공백을 제거하고 출력//
		hw = "Hello World";
		
		//i를 hw.length()의 최소값인 0부터 최대값까지 반복
		for (int i = 0 ; i < hw.length() ; i = i + 1) {
			
			//hw.charAt(i)가 공백인 ' '이 아닐경우 출력
			if(hw.charAt(i) != ' ') {
				System.out.print(hw.charAt(i));
			}
		}
		
		
		
		System.out.print("\n\n\n");

		//////////////////////////////////////////////////////////////////
		// "GGCDGCCGDDGCCGCCGDDCKGCCGKK" 문자열에서 GCCG 의 위치를 전부 출력하기//

		//문자열을 넣을 변수를 생성
		String str = new String();
		str = "GGCDGCCGDDGCCGCCGDDCKGCCGKK";
		//str.length()가 0부터 시작하기떄문에 정수를 담아줄 temp_str 변수를 생성
		int temp_str = 0;
		
		//str에 넣어진 데이터를 출력
		System.out.print(str + "\n");

		//str.length()의 시작인 0부터 시작하여 i를 ++ 하여 str.length()까지 반복
		for(int i = 0 ; i < str.length() ; i = i + 1) {
			
			//4개씩 체크하기때문에 i+4가 str.length()를 넘어가게되면 Exception이 발생하여 예외처리를 함
			if ( (i+4) > (str.length())) {
				break;
			}
			
			//GCCG를 체크하기위해
			//i위치에 있는 글자가 G
			//i+1위치에 있는 글자가 C
			//i+2위치에 있는 글자가 C
			//i+3위치에 있는 글자가 G 일 때
			if(str.charAt(i) == 'G' && str.charAt(i+1) == 'C' && str.charAt(i+2) == 'C' && str.charAt(i+3) == 'G') {
				
				//GCCG 위치를 제외한 나머지에 공백을 넣기위한 반복문
				//j의 초기값은 temp_str에 저장된 수로 지정
				//temp_str부터 i값까지 반복
				for(int j = temp_str ; j < i; j = j + 1) {
					System.out.print(" ");
				}
				
				//i부터 i+3까지는 GCCG이므로
				//그 다음부터 공백을 넣어주기위해
				//temp_str에 i+4값을 넣어줌
				temp_str = i+4;
				
				//출력된 str 아래에 GCCG를 표시하기 위한 텍스트
				System.out.print("^^^^");
				
				//i 부터 i+3까지는 GCCG
				//겹쳐진 G를 중복체크하는걸 방지하기위해 i+3을 i에 입력
				//i+3인 이유는 for문이 다시 반복 될 때 i = i + 1 을 하므로
				//실질적으론 i + 4가 됨
				i = i +3;
			}
		}
		
		
		
		System.out.print("\n\n\n");
		
		////////////////////////////////////////////////////////////////////
		// "GGCDGCCGDDGCCGCCGDDCKGCCGKK" 문자열에서 GCCG 의 위치를 전부 출력하기 2//
		
		//문자열을 넣을 변수를 생성
				String str2 = new String();
				str2 = "GGCDGCCGDDGCCGCCGDDCKGCCGKK";
				//str.length()가 0부터 시작하기떄문에 정수를 담아줄 temp_str2 변수를 생성
				int temp_str2 = 0;
				
				//str.length()의 시작인 0부터 시작하여 i를 ++ 하여 str2.length()까지 반복
				for(int i = 0 ; i < str2.length() ; i = i + 1) {
					
					//4개씩 체크하기때문에 i+4가 str2.length()를 넘어가게되면 Exception이 발생하여 예외처리를 함
					if ( (i+4) > (str2.length())) {
						break;
					}
					
					//GCCG를 체크하기위해
					//i위치에 있는 글자가 G
					//i+1위치에 있는 글자가 C
					//i+2위치에 있는 글자가 C
					//i+3위치에 있는 글자가 G 일 때
					if(str2.charAt(i) == 'G' && str2.charAt(i+1) == 'C' && str2.charAt(i+2) == 'C' && str2.charAt(i+3) == 'G') {
						
						//GCCG의 각 위치값을 출력
						//str2.length()는 0부터 시작하므로
						//i+1를 하여 자리위치를 출력함
						System.out.print(i+1);
						System.out.print(" ");
						System.out.print(i+2);
						System.out.print(" ");
						System.out.print(i+3);
						System.out.print(" ");
						System.out.print(i+4);
						System.out.print("\n");
						
						//i 부터 i+3까지는 GCCG
						//겹쳐진 G를 중복체크하는걸 방지하기위해 i+3을 i에 입력
						//i+3인 이유는 for문이 다시 반복 될 때 i = i + 1 을 하므로
						//실질적으론 i + 4가 됨
						i = i +3;
					}
				}
	}
}

