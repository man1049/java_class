package a211101;

public class Main3 {

	public static void main(String[] args) {

		MethodClass J_va = new MethodClass();
		J_va.h_java(3);

		MethodClass.h_java2(4);
		MethodClass.h_java2(5);
		//스테틱을 이용한 리턴
		//System.out.println(MethodClass.h_java2(5));

		//스테틱을 이용하지않은 리턴
		MethodClass j_va = new MethodClass();
		j_va.h_java3(5, 8);

		MethodClass[] j_varray = new MethodClass[5];

		for (int i = 0 ; i < 5 ; i = i + 1) {
			j_varray[i] = new MethodClass();
		}

		int j1 = j_varray[0].h_java3(5, 10);
		int j2 = j_varray[1].h_java3(153, j1);
		int j3 = j_varray[2].h_java3(j1, j2);
		int j4 = j_varray[3].h_java3(j3, j2);
		int j5 = j_varray[4].h_java3(j3, j4);

		System.out.println(j1+"\t"+j2+"\t"+j3+"\t"+j4+"\t"+j5+"\t");
	}


}
