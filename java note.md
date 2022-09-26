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
https://m.blog.naver.com/leejjoo112/222007699174
