# First Board Project
스프링 부트를 이용한 게시판 프로젝트
![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/504174f6-d7fd-422e-a047-407551f816aa)

![스프링부트3](https://github.com/Baesiru/springboot_first_board/assets/151522558/bdaada19-4f3b-493b-82f1-45ea897ed9b1)

코딩 자율학습 스프링 부트3 자바 백엔드 개발 입문 
* 해당 서적을 이용하여 학습한 내용
  * 스프링 부트의 기본기
  * 자바 Servlet/JSP 차이점
  * JDBC(Java DataBase Connectivity)와 JPA(Java Persistence Api)의 차이점 및 ORM(Object-Relational Mapping)
  * RestFul API 학습

## 기술 스택
```Java``` ```Spring Boot``` ```Spring Data JPA``` ```H2-Database``` ```Html/Css``` ```Java Script``` ```Mustache``` ```Bootstrap 5.0.2```

# 게시판 기본 기능
* 전체 게시글 보기
  
  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/504174f6-d7fd-422e-a047-407551f816aa)

* 개별 개시글 확인

  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/2aefe051-102c-40d3-9161-89bf87d57449)

  
* 게시글 작성/수정/삭제

  * 게시글 작성

    ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/ba393c24-d657-4f4e-b662-78da50a48d69)

  * 게시글 수정
 
    ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/2acc04f8-03b6-40c3-a2ff-9f6d4b48967d)
    ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/872f2132-70d2-4d5c-89c6-f04aaf1b2528)

  * 게시글 삭제
    
    ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/9841d0c7-f390-47c3-a0b8-b8b70b002f98)
* 댓글 작성/수정/삭제

  * 댓글 작성
    
  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/3d2fbb3e-0610-41b9-a8b5-f544738eaf72)

  + 댓글 수정
    
  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/14c7889a-f110-4fd3-a3af-e98397eadddd)

  + 댓글 삭제
    

  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/f649ccbf-45b2-40bb-bec0-bffd568bed96)
  ![image](https://github.com/Baesiru/springboot_first_board/assets/151522558/d9f399b1-a4a6-40d1-a55c-12aae8794b48)

# 프로젝트 마무리 소감
프로젝트 구현을 할 때 Controller와 RestController 애너테이션을 모두 사용하여 구현하였습니다.
이를 통해 스프링부트에서 MVC패턴의 Model, View, Controller들의 역할에 대한 구분을 조금 더 확실히 할 수 있게 되었으며, 
Restful API에 대한 이해를 할 수 있게 되었습니다.<br>
하지만 직접 책에 있는 프로젝트를 하면서 회원가입과 로그인, 더 디테일한 부분 등에 대해 더 구현하지 못해 완성도가 떨어지고, 
효율성에 대한 분석을 제대로 하지 못한 것이 아쉬웠습니다.<br>
다음 프로젝트에서는 구현하지 못한 여러 기능들과 SNS의 API들을 이용한 구현 등을 Restful API 위주로 구현하는 것, 
프로젝트를 진행하면서 지금까지 배웠던 여러 개념들에 대한 정리 및 복습을 위주로 할 예정입니다.
