eclipse 자동완성
https://velog.io/@zz1996zz/Eclipse%EC%9D%B4%ED%81%B4%EB%A6%BD%EC%8A%A4-%EC%9E%90%EB%8F%99%EC%99%84%EC%84%B1-%EC%84%A4%EC%A0%95%ED%95%98%EA%B8%B0

220907 java 개념정리
primitive data type(원시 데이터 타입) : 스택, 값
논리값 : boolean(true, false)
문자 : char
정수 : byte, int short long
실수 : float, double 

reference data type : 힙(heap), 주소
배열 : array
클래스 : class
인터페이스 : interface

데이터 타입이 있어야 변수를 만들 수 있다. = 모든 변수는 데이터 타입이 있어야 한다.
= 변수는 그 안에 들어가는 데이터 타입을 결정하고 사용해야 한다.
= 스크립트 언어를 제외한 거의 모든 언어는 데이터 타입을 결정하고 변수를 사용해야 한다.

문장(statement)을 구분하는 구분자는 ;이다. 
= 모든 문장 뒤에는 ;를 적어야 한다.(예외({}, if, switch, for, while, method)도 있다.)

식별자 identifier - 구분자
여러 개 중에 하나를 구분하기 위해 사용하는 이름을 컴퓨터에서 식별자라고 합니다.
여러 개를 사용할 수 있는 것은 무엇이 있을까요? - 클래스, 메소드, 변수, 상수 등

망각곡선=복습 - 반복하는 방법 : why, because

헝가리안 표기법 : 변수명 앞에 변수의 자료형을 알 수 있는 문자를 사용하는 것.
카멜 표기법 : 앞 단어의 첫 글자는 소문자 뒤 단어의 첫 글자는 대문자.
파스칼 표기법 : 모든 단어의 첫 글자는 대문자 나머지는 소문자.

조건문
선택문 : if, if ~ else, else if
반복문 : for, for each, while, do - while
흐름 제어 : break //block 탈출, continue //아래명령 무시, return //호출한 곳으로 돌아가기

ctrl + shift + o : 자동 import ex)import java.util.Scanner;

220915
eclipse에서 줄번호 우클릭 : breakpoint - f11버튼은 debug, f6버튼 줄별로 실행

220919
반복하는 횟수가 정해져 있지 않을때 while문, 반복하는 횟수가 정해져 있으면 for문 사용
eclipse에서 arguments 지정 : Run - Run Configurations - Arguments. 각 인자는 띄어쓰기로 구분

2차원배열 int i[][] = new int[2][5]; 에서 배열 크기에 접근하려면
행의 길이 : i.length, //2 열의 길이 : i[0].length; i[1].length //5

220920
enum : 열거형 자료형, 원소에 ""를 붙이지 않음. main보다 위에 전역으로 사용
정방형 배열, 비정방형 배열
전역변수, 지역변수, 매개변수

220921
eclipse에서 rename(치환)= 더블클릭 - 우측버튼 - refactor - rename

객체생성
class명 객체명 = new 생성자명();
생성자 : 객체 생성시 필드 값을 초기화
this. //클래스 내의 자신을 가리킴. 
ex) 생성자
public CircleConst(int radius) {
  this.radius = radius; }
 CircleConst pizza1 = new CircleConst(5);
에서 좌변 radius는 클래스 내에 선언된 변수, 우변 radius는 객체 생성시 받아온 인자를 가리킨다.

### 220926 (생성자)
getter setter : source-generate constructor using fields, source-generate Getters and setter
this. : 클래스 내 자신 / this() : 클래스 내 다른 생성자 호출, 반드시 생성자 코드 첫줄에
메소드 오버로딩 : 매개변수 개수에 따라서 호출되는 생성자가 다름. (한개의 이름으로 여러 성질)
super() : 부모 클래스의 변수 참조, 부모 생성자 호출
java api 8
p202, 204 이해하기
set메소드는 private로 선언된 필드의 값을 수정할때 필요. private에 직접 접근 불가능하므로 객체는 입력값을 setter메소드의 매개값으로 넘겨주고 값을 검사하고 나서 그 값이 필드의 값으로 적절한 경우에만 저장.
Getter : 데이터를 읽어오는 역할을 주로 수행. 
(https://m.blog.naver.com/leejjoo112/222007699174)

220927
메소드 오버로딩 : 매개변수의 개수와 타입이 다르면 한 이름으로 여러개 메소드를 선언 가능.
접근 지정자가 생략되어 있으면 default(같은 패키지만), protected : 같은 패키지 + 자식 클래스 접근허용

### 220928 (heap, stack, 오버로딩)
변수는 stack에 만들어짐, 객체(참조변수)는 heap에 만들어짐, heap의 주소는 stack에 가지고 있음.
Circle pizza = new Circle(5);에서 pizza는 객체가 생성된 heap의 주소를 담은 변수.
Circle donut;에서 donut는 Circle로 만든 객체의 주소를 담는 변수.
파라미터=매개변수=인자
prototype : int foo(int a, int b)와 같은 함수 원형을 의미한다.
signature : foo(int a, int b)와 같이 리턴값을 제외한 함수명과 파라메터를 의미한다.
parameter : foo(int a, int b)int a, b 를 의미한다.
method overloading은 signature의 paramater 개수, 타입, 순서가 다르면 같은 이름의 메소드를 생성할 수 있는 것을 의미한다.
모든 필드는 private로 선언하고 다른 곳에서 접근하게 하려면 getter, setter 선언
java파일에서 하나의 메인 클래스에서만 public을 지정할수 있음.

### 0929 (static)
객체생성시 객체는 heap에 저장, 객체를 가리키는 주소는 stack에 저장. sc1.a와 sc.2의 a는 메모리에서 저장위치가 다름
static으로 변수 n 선언시 모든 객체가 n을 공유함(다른 객체더라도 모두 같은 변수 n을 가리킴)
sc1.n = 1;처럼 객체이름으로 n(필드)의 값을 지정할 수 있으나 클래스명.n = 1; 처럼 클래스명으로 static 필드의 값을 지정.
객체를 만들지 않아도 static로 메소드를 선언하면 클래스이름.메소드로 바로 사용가능.

oracle -Developers - Developer Resource Center - java - Learn more about Java SE - Documentation - Java Platform Standard Edition Technical Documentation site - 찾고싶은것 검색.
.abs : 절대값으로 나타냄  //Java document 사이트에서 Math 클래스 참조
Math.PI에서 Math는 이미 자바 내 정의되어있는 디폴트 클래스

221004(상속)
함수 사용할때 : 객체명.함수명();  ex)song.show();
객체 생성시 생성자가 없어도 default생성자 때문에 생성가능
필드를 private로 지정하지 않았다면 main함수에서 필드 값 초기화 가능
상속 : extends, 중복상속가능
필드는 private, 메소드, 는 public, 자식한테 접근 가능하게 하려면 protected

221005(상속, super, 캐스팅)
모든 클래스는 자동으로 java.lang.Object를 상속받음
객체생성시 인자를 한 개 주었을 때 인자를 하나 받는 생성자가 실행되는데 부모 클래스의 기본 생성자(매개변수 없는 생성자(디폴트))들도 모두 실행
생성자 안에 super(); 적으면 부모클래스의 생성자를 지정해서 호출가능
super(매개변수); 적으면 부모클래스의 생성자 중에 디폴트생성자가 아닌 매개변수를 받는 생성자 호출. 생성자 호출과 원리 같음
//toString는 Object에서 상속받기 때문에 모든 객체에서 사용가능
아무 일 안하더라도 default(비어있는) 생성자 만들어두기

### 221006 (instanceof, 업/다운캐스팅)
instanceof : 객체의 타입 식별. if(p instanceof Student) // p가 student의 객체이면 true이므로 if아래문장 실행

int num = 10;에서 형 변환시 double data = num;은 가능하지만 num에 double을 넣는건 안됨, 캐스팅 필요
상속에서 왼쪽이 부모, 오른쪽이 자식 // 부모 = 자식;은 가능    //업캐스팅(자식이 부모한테)
왼쪽이 자식, 오른쪽이 부모이면 형변환 필요. 
Person p = new Student("이재문")
Student s = (Student)p; //왼쪽이 자식일 경우에는 형변환. //다운캐스팅(부모가 자식한테)

메소드 오버로딩(loading) vs 오버라이딩(riding)
오버로딩
-메소드 시그니쳐가 다른 같은 메소드 이름을 여러 개 정의할 수 있음.(타입, 개수, 순서)
-여러 개의 생성자를 만들 수 있음. 같은 이름의 메소드를 여러 개 만들 수 있음.
-abc(), abc(int a), abc(double d), abc(int a, double d), abc(doubld d, int a)
오버라이딩
-슈퍼클래스의 메소드를 서브클래스에서 재정의. 무시하기, 덮어쓰기로 번역하기도 함.

super.메소드명(); - 부모 메소드 실행
