# 소프트웨어 공학 Mission2 실습
탐장: C035467 양현서
팀원: C011174 이지현

역할\
양현서: 레포지토리 생성, BookSearchBS Class 작성, PerformanceTestBS Class 작성, Jenkins CI/CD 과정 구축\
이지현: BookSearchBSTest 작성, Junit Test 코드 실행

git 프로젝트 주소: https://github.com/hy-seo0608/SW_Practice

# Github 관련 에러 메세지

-에러 메세지: github repository 토큰의 기간이 만료되어 만료된 토큰으로 접속하려고 시도했을 때 나타난 메세지\
-해결 방법: github에서 토큰을 재발급 받아 다시 로그인하여 repository와 연동
![스크린샷 2024-06-15 022105](https://github.com/hy-seo0608/SW_Practice/assets/164537644/2ccf40b2-0ac5-4939-a874-7a6a43bbf2ea)


-에러 메시지: 원격 리포지토리와 연결 실패\
-해결 방법: 깃헙 contributer invite 요청 수락\
<img width="435" alt="스크린샷 2024-06-15 오후 1 37 31" src="https://github.com/hy-seo0608/SW_Practice/assets/87516653/acae1288-c3f7-4d50-8d05-905f1134f9f4">


# Jenkins에서 겪은 에러 메세지

-에러 메세지: javac 컴파일러가 org.junit.jupiter.api 패키지를 찾지 못해서 발생한 오류\
-해결 방법: junit-platform-console-standalone-17.1.jar 파일을 다운로드하여 eclipse/plugins 디렉토리에 저장하고, environment 경로를 eclispse/plugins 디렉토리로 지정함

![스크린샷 2024-06-16 232632](https://github.com/hy-seo0608/SW_Practice/assets/164537644/3f9c5706-a848-45b0-8bdc-24ed2054855e)


-에러 메세지: javac 명령이 잘못된 플래그를 받았다는 오류\
-해결 방법: javac 명령어에 전달되는 소스 파일 목록이 올바르게 형성되지 않은 것인지 확인하는 코드를 젠킨스 파일에 작성함\
소스 파일 목록은 올바르게 전달되고 있다는 것은 확인, 이후 각 파일 경로에 공백이 포함되는 경우 등 적절히 처리하도록 코드를 수정함. 

![image](https://github.com/hy-seo0608/SW_Practice/assets/164537644/fe3170b8-70ad-4880-b624-870b6b928b44)


-에러 메시지: 깃헙과 연결 실패\
-해결 방법: fork 후 본인 리포지토리 webhook 추가\
<img width="1050" alt="스크린샷 2024-06-17 오전 2 48 45" src="https://github.com/hy-seo0608/SW_Practice/assets/87516653/12311333-458f-40ae-9402-2ac7fc3f672e">




# Jenkins CI/CD 구동 아웃풋 로그
![image](https://github.com/hy-seo0608/SW_Practice/assets/164537644/f6c1a1f8-14ff-439c-a237-e5f3cdb98253)

![image](https://github.com/hy-seo0608/SW_Practice/assets/164537644/1536798f-99e7-407a-a902-adf2ab10cf61)

![image](https://github.com/hy-seo0608/SW_Practice/assets/164537644/2981de26-5ce4-4dba-a627-5ba564cacf9a)



![image](https://github.com/hy-seo0608/SW_Practice/assets/164537644/85543b1e-256e-47bb-ab30-7f6aa55aa80b)






-----------------------------------------------------------------------------------

# 소프트웨어 공학 Mission1 실습
역할\
양현서: Book Class 작성, BookManager Class 작성, \
이지현: BookManagerTest 코드 작성, BookManager 클래스에 대해 JUnit Test 코드 실행

# Test Code 실행결과

<img width="1440" alt="소공 미션1 실습" src="https://github.com/hy-seo0608/SW_Practice/assets/164537644/a5747605-3da7-4c59-ab2d-fa41e8df924c">
