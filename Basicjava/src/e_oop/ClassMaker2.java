package e_oop;

public class ClassMaker2 {
	
	//인스턴스변수 하나를 선언하고 명시적으로 초기화 해주세요.
	int name = 10;
	//위에서 선언한 인스턴스변수를 초기화 블럭을 사용해 초기화 해주세요.
	{
		name = 20;
	}
	//위에서 선언한 인스턴스변수를 생성자의 파라미터를 사용해 초기화 해주세요.
	ClassMaker2(int name){
		this.name=name;
	}
	
	//위에서 선언한 인스턴스변수를 생성자를 하나 더 만들어서 초기화 헤주세요.
	ClassMaker2(){
		this(60);
	}
	
	//초기화순서 : 명시적 초기화 -> 초기화 블럭 -> 생성자
}
