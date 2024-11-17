# kotlin-racingcar

###  step2 : 문자열 계산기

##### 요구 사항
* 문자열 입력 기능
  - [ ] null 또는 빈 공백 허용 안함
  - [ ] 사칙 연산 기호(+,-,*,/)만 허용함

* 문자열 분리 기능
  - [ ] 입력된 문자열 하나씩 븐리 
  - [ ] 사칙 연산 기호 중첩 허용 안함 (예:2+*3)
  - [ ] 숫자 다음엔 기호, 기호 다음엔 숫자가 와야함
  - [ ] 문자열 첫번째, 마지막 반드시 숫자
  
* 문자열 계산 기능 
  - [ ] 덧셈 기능
  - [ ] 뺄셈 기능
  - [ ] 곱셈 기능 
  - [ ] 나눗셈 기능
  - [ ] 입력 연산 기호 순차 계산(사칙 연산 우선 순위 무시)

* 문자열 계산 결과 출력
  - [ ] 사칙 연산 모두 포함한 결과 출력

---
### step3 : 자동차 경주

##### `기능 요구사항`
  - 주어진 횟수 동안 n대의 자동차는 전진 또는 멈출 수 있다.
  - 용자는 몇 대의 자동차로 몇 번의 이동을 할 것인지를 입력할 수 있어야 한다.
  - 전진하는 조건은 0에서 9 사이에서 무작위 값을 구한 후 무작위 값이 4 이상일 경우이다.
  - 자동차의 상태를 화면에 출력한다. 어느 시점에 출력할 것인지에 대한 제약은 없다.

##### `요구사항 정리` 
* 입력 기능
  - [X] 자동차 대수 입력
  - [X] 시도할 횟수 입력

* 자동차
  - [ ] 조건이 되면 한칸씩 이동 할 수 있다 
  - [ ] 자동차 점수 상태 값을 가진다(한칸 이동 1점)

* 점수
  - [ ] 자동차 마다 점수를 가진다
  - [ ] 변하는 상태 가변 값  

* 움직임 전략
  - [ ] 랜덤 주사위 전략 : 주사위 값 4이상 전진, 3이하 제자리 
  - [ ] 움직 일 수 있는 전략 : 주사위 값은 항상 4이상
  - [ ] 움직 일 수 없는 전략 : 주사위 값은 항상 3이하
  - [ ] 공통 기능 
    - [ ] 주사위 숫자 생성 : 고정, 랜덤
    - [ ] 움직일 수 있는지 판단  

* 레이싱 게임
  - [ ] 사용자 입력한 자동차 대수와 게임 라운드 상태 값을 가진다
  - [ ] 각 라운드를 진행하고 움직임 전략에 따라 자동차를 움직인다

* 화면 
  - [ ] 자동차 수와 시도할 라운드 수를 입력 받을 수 있도록 출력
  - [ ] 실행 결과 자동차 상태 출력