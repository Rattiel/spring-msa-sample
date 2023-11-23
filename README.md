# spring-msa-sample

# 실행 방법
1) eureka-server를 실행 시킨다. (할당 포트: 8761)
2) service-server를 2개를 실행 시킨다. (할당 포트: 랜덤)
3) gateway-server를 1개를 실행 키킨다. (할당 포트: 8090)
4) <a href="http://localhost:8761">http://localhost:8761</a> 로 접속하여 등록된 서비스 목록을 조회한다.
5) 서비스 목록중에 service-server 및 gateway-server이 존재하는지 확인하며 없을시 재실행을 시킨다.
6) <a href="http://localhost:8090/service">http://localhost:8090/service</a>에 접속하여 랜덤하게 서비스 서버에 연결되는지 확인한다.
