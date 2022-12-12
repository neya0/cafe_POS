# Cafe POS 만들기
에스프레소 종류와 라떼 종류만 파는 카페 POS기의 API를 만들어보자.

# 요구 조건

- 카페의 메뉴는 에스프레소와 라떼로 분류된다.
    - 에스프레소는 에스프레소가 들어간 모든 음료.
    - 라떼는 에스프레소를 제외하고 우유가 들어간 모든 음료.
- 소비자가 고른 메뉴는 장바구니에 들어가야 한다.
    - 소비자가 고른 메뉴 가격의 총 합을 도출해야한다.
    - 소비자가 고른 메뉴를 취소할 수 있다.
- 각 커피의 판매량을 알 수 있다. 
  - 매장의 총 매출을 알 수 있다.

# 기술 스택
<img src="https://img.shields.io/badge/java-007396?style=for-the-badge&logo=java&logoColor=white">
<img src="https://img.shields.io/badge/spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white"> 

# 추가적 질문
- 만일 커피 메뉴 중 여러가지를 한 번에 가격 인상하게 된다면?

# 현재 상황
- 동일한 필드를 두 번 쓰기 싫어서 부모와 자식 클래스로 나누려고 했는데 맞는지 잘 모르겠다.