package naver.man10_49.Practice;

import java.util.Scanner;

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

		////////////////
		// 애너그램 판별 //

		System.out.print("애너그램 판별시작 \n");
		Scanner sc = new Scanner(System.in);

		String ag = new String();
		System.out.print("첫번째로 비교 할 문장이나 단어를 입력해주세요. : ");
		ag = sc.nextLine();
		char[] ag2 = new char[ag.length()]; // 스페이스바를 제외한 문자를 넣기위해 생성한 임시배열을 ag의 길이만큼 생성
		char[] ag3; // ag2의 데이터를 옮기기위한 배열
		int ag_space = 0; // 스페이스바의 개수를 체크하기위한 변수
		int ag_count = 0; // 문자를 카운트하기위한 변수

		String ag_check = new String();
		System.out.print("두번째로 비교 할 문장이나 단어를 입력해주세요. : ");
		ag_check = sc.nextLine();

		char[] ag_check2 = new char[ag_check.length()]; // 스페이스바를 제외한 문자를 넣기위해 생성한 임시배열을 ag_check의 길이만큼 생성
		char[] ag_check3; // ag_check2의 데이터를 옮기기위한 배열
		int ag_check_space = 0; // 스페이스바의 개수를 체크하기위한 변수
		int ag_check_count = 0; // 문자를 카운트하기위한 변수

		boolean ana_check = false; //스페이스바를 제외한 ag3와 ag_check3의 길이를 비교하여 체크하기 위한 변수
		int ag_same_count = 0;
		
		sc.close();
		
		//while을 사용한 이유는 예외처리 시 break로 진행을 멈추기 위함임
		while(true) {

			// 글자가 같을 시 예외처리
			if(ag.equals(ag_check)) {
				System.out.println("애너그램이 아닙니다. (같은 문자열)");
				break;
			}


			//////스페이스바를 제외한 글자수를 구하기//////

			// i는 0부터 시작하여 ag.length()까지 반복
			for(int i = 0 ; i < ag.length() ; i = i + 1 ) {

				//ag.charAt(i)을 불러와서 스페이스바이면 ag_space에 1을 더해줌
				//스페이스바가 아닐 시 ag2[i]에 ag의 i번째 문자열을 대입함
				if(ag.charAt(i) == ' ') {
					ag_space = ag_space + 1;
				}else if(ag.charAt(i) != ' ') {
					ag2[i] = ag.charAt(i);

				}
			}
			//ag3의 배열크기를 (ag2의 길이 - 스페이스바 개수)로 지정
			ag3 = new char[ag2.length - ag_space];

			//배열의 해당 위치가 빈 공간일때 카운트하기위해 초기화
			ag_space = 0 ;

			//ag3의 길이만큼 반복
			for(int i = 0 ; i < ag3.length ; i = i + 1) {

				//ag2[i+ag_space]가 0(빈공간) 일 때
				if(ag2[i+ag_space] == 0) {

					//ag_space를 1 증가시킴
					ag_space ++;

					//ag3[i]는 여전히 빈 공간이기 떄문에 i를 초기화
					i-- ;
					continue;
				}

				//ag3[i]에 ag2[i+ag_space]를 대입함
				//ag_space는 빈 공간을 제외하기 위해 카운트 한 수 이기때문에
				//ag2의 빈 공간을 대입하지 않음
				ag3[i] = ag2[i+ag_space];
			}

			///////////////////위와 같은 내용임///////////////////
			for(int i = 0 ; i < ag_check.length() ; i = i + 1 ) {
				if(ag_check.charAt(i) == ' ') {
					ag_check_space = ag_check_space + 1;
				}else if(ag_check.charAt(i) != ' ') {
					ag_check2[i] = ag_check.charAt(i);
				}
			}
			ag_check3 = new char[ag_check2.length-ag_check_space];

			ag_check_space = 0 ;

			for(int i = 0 ; i < ag_check3.length ; i = i + 1) {
				if(ag_check2[i+ag_check_space] == 0) {
					ag_check_space ++;
					i-- ;
					continue;
				}
				ag_check3[i] = ag_check2[i+ag_check_space];
			}

			////////////////////////////////////////////////////////////////////

			//스페이스바를 제외한 문자열이 같은 문자열인지 판정
			for(int i = 0 ; i < ag_check3.length ; i = i + 1) {
				if(ag3[i] == ag_check3[i]) {
					ag_same_count++;
				}
			}

			if(ag_same_count == ag3.length) {
				System.out.print("애너그램이 아닙니다. (띄어쓰기를 제외한 같은 문자열)");
				break;
			}

			
			ag = null;
			ag_check = null;
			ag2 = null;
			ag_check2 = null;

			//ana_check가 true일때 진행하며
			//false이면 애너그램이 아니라고 출력함

			//ag3와 ag_check3가 서로 같은 문자를 사용하는지 판별
			
			//i를 ag3.length까지 반복
			for(int i = 0 ; i < ag3.length ; i = i + 1) {
				
				// j를 ag3.length까지 반복
				for(int j = 0 ; j < ag3.length; j = j + 1) {
					
					//ag3[i]와 ag3[j]를 비교하여
					//같은 문자가 있을 시 ag_count++를 함
					if(ag3[i] == ag3[j]) {
						ag_count++;
					}
				}
			}
			
			//i를 ag3.length까지 반복
			for(int i = 0 ; i < ag3.length ; i = i + 1) {
				
				//j를 ag_check3.length까지 반복
				for(int j = 0 ; j < ag_check3.length; j = j + 1) {
					
					//ag3[i] 와 ag_check3[j]를 비교하여
					//같은 문자가 있을 시 ag_check_count++를 함
					if(ag3[i] == ag_check3[j]) {
						ag_check_count++;
					}
				}
			}				

			//ag_count 와 ag_check_count가 같다면
			//사용한 문자가 같다는 의미이므로
			//true 일시 애너그램 false 일시 애너그램이 아님
			if(ag_count == ag_check_count) {
				System.out.print("\n 애너그램입니다.");
			}else {
				System.out.print("\n 애너그램이 아닙니다.");
			}

			break;
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

