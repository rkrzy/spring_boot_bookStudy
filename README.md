# spring_boot_bookStudy
## 도서 : 스프링 부트 3로 백엔드 입문하기

<details>
<summary>1장 : 자바 백엔드 개발자가 알아두면 좋은 지식</summary>
## 개념

### 클라이언트 : 서버로 요청하는 프로그램 모두
### 서버 : 클라이언트의 요청을 받아 처리하는 주체

### 데이터베이스
정의 : 여러 사람이 데이터를 한 군데에 모아놓고 여러 사람이 사용할 목적으로 관리하는 데이터 저장소
종류 : MySQL, 오라클, postgreSQL

RDB : Relational Database의 약자로 관계형 데이터베이스라는 뜻이다.
- 데이터를 행과 열로 이루어진 테이블로 관리한다.
- 기본키를 사용해 각 행을식별한다.
- 각 테이블 간의 관계를 지을 수 있다.

SQL : Structured Query Language의 약자로 데이터를 검색하는 언어다.

NoSQL : SQL을 안 쓴다는 의미로 사용되기도 하고, 최근에는 Not Only SQL의 의미로 많이 사용된다.
- RDB는 데이터 저장, 질의, 수정, 삭제가 용이하다. -> 반면에 성능을 올리는게 힘들다.
- 데이터베이스의 성능을 높이려면 스케일 업, 스케일 아웃이 필요하다.
  - 스케일 업 : 장비를 업그레이드 하면 된다.
  - 스케일 아웃 : 데이터베이스 분산이 필요하다.
  - 이때 트랜잭션을 사용하면 성능이 떨어진다.
- 이런 RDB의 문제점을 해결하기 위해서 NoSQL 데이터베이스가 만들어졌다.

### 아이파와 포트
<p>IP : 인터넷에서 컴퓨터 또는 기기들이 서로를 식별하고 통신하기 위한 주소</p>
<p>포트 : 그 서버에서 운용되고 있는 서비스를 구분하기 위한 번호</p>

### 라이브러리와 프레임워크
<p>
라이브러리 : 애플리케이션 개별에 필요한 기능인 클래스, 함수 등을 모아놓은 코드의 모음
<li>개발을 하는 과정에서 필요한 기능을 구현하기 위해 사용하는 것.</li>
</p>
<p>프레임워크 : 소프트웨어 개발을 수월하게 하기 위한 소프트웨어 개발 환경이다.

<li>정해진 틀에서 개발해야 한다는 단점이 있지만 개발 효율은 굉장히 높아진다.</li>
<li>애플리케이션을 개발할 때 전체적인 구조를 잡기 위해 사용하는 것</li>
</p>

### 백엔드 개발자의 역할
<ol>
<li>과제 할당</li>
<li>과제 분석</li>
<li>개발</li>
<li>테스트</li>
<li>QA</li>
<li>배포</li>
<li>유지보수</li>
<ul>
<li>과제를 한 번에 병합해서 배포하거나 새로운 기능이 추가될 때마다 배포한다.</li>
<li>롤링 배포 : 특정 개수의 서버들을 돌아가며 배포한다.</li>
<li>카나리 배포 : 전체 서버의 특정 비율만큼 배포해보고 문제없는 경우 점점 배포를 늘려간다.</li>
<li>CI(Continuous Integration)/ CD(Continuous Delivery & Continuous Deployment)</li>
<li>CI : 지속적인 통합, 새로운 코드 변경 사항이 정기적으로 빌드 및 테스트되어 저장소에 통합된다.</li>
<li>CD : 지속적인 배포</li>
</ul>
</ol>

### 자바 애너테이션
정의 : 자바로 작성한 코드에 추가하는 표식
<ol>
<li> JDK 1.5버전부터 사용이 가능하다.</li>
</ol>

</details>

<details>
<summary>2장 : 스프링 부트 3 시작하기</summary>

### 스프링과 스프링 부트
<p>엔터프라이즈 애플리케이션 : 대규모의 복잡한 데이터를 관리하는 애플리케이션</p>
<ul>
<li>많은 사용자의 요청을 동시에 처리해야 하므로 서버 성능과 안정성, 보안이 매우 중요하다.</li>
<li>개발자가 여러 사항(성능, 안정성, 보안 등)을 생각하면서 개발하는건 어려움 -> 이걸 해결하는게 스프링(2003년 6월)</li>
<li>스프링은 매우 복잡하다는 단점이 있다. -> 이걸 보완하는게 스프링 부트 (2013년 4월 0.5.0 M6 버전 첫공개)</li>
</ul>

<p>스프링 부트의 주요 특성</p>
<ol>
<li>톰캣, 제티, 언더토우 같은 웹 애플리케이션 서버가 내장됨.</li>
<li>빌드 구성을 단순화하는 스프링 부트 스타터를 제공한다.</li>
<li>XML설정을 하지 않고 자바 코드로 모두 작성이 가능하다.</li>
<li>JAR을 이용해서 자바 옵션만으로도 배포가 가능하다.</li>
<li>애플리케이션의 모니터링 및 관리 도구인 <b>스프링 액츄에이터</b>를 제공한다.</li>
</ol>

<p>스프링과 스프링부트의 차이점</p>
<ol>
<li>스프링은 개발에 필요한 환경을 수동으로 구성</li>
<li>스프링 부트는 스프링 코어, 스프링 MVC의 모든 기능을 자동으로 로드</li>
<li>스프링 부트는 WAS를 자체적으로 가지고 있다.</li>
</ol>

### 제어의 역전과 의존성 주입
<p>IOC(Inversion of Control)(제어의 역전)란?</p>
<ol>
<li>다른 객체를 직접 생성하거나 제어하는 것이 아닌 외부에서 관리하는 객체를 가져와 사용하는 것</li>
<li>스프링은 스프링 컨테이너가 객체를 관리, 제공하는 역할을 한다.</li>
</ol>

<p>DI(Dependency Injection)(의존성 주입)란?</p>
<ol>
<li>어떤 클래스가 다른 클래스에 의존한다는 뜻</li>
<li>@Autowired라는 애너테이션을 사용해서 스프링 컨테이너에 있는 빈이라는 것을 주입한다.</li>
</ol>

<p>이런 기능등을 사용해서 스프링은 자바 코드로 직접 생성하는게 아닌 스프링 컨테이너에서 객체를 주입받아 사용한다.</p>

### 빈과 스프링 컨테이너
<p>스프링 컨테이너란?</p>
<ol>
<li>빈을 생성하고 관리한다. 빈이 생성되고 소멸되기까지의 생명주기를 이 스프링 컨테이너가 관리하는 것이다.</li>
</ol>

<p>빈이란?</p>
<ol>
<li>스프링 컨테이너가 생성하고 관리하는 객체</li>
<li>등록하기 위해서 XML파일 설정, 애너테이션 추가 같은 방법들을 제공한다.</li>
<li>@Component애너테이션을 이용해서 빈으로 등록할 수 있다.</li>
<li>빈으로 등록될때는 첫 글자를 소문자로 바꿔서 관리한다.</li>
</ol>

### 관점 지향 프로그래밍
<p>AOP(Aspect Oriented Programming)</p>
<ol>
<li>프로그래밍에 대한 관심을 핵심 관점, 부가 관점으로 나눠서 관심 기준으로 모듈화를 한다.</li>
<li>하나의 로직을 개발할때 기능을 핵심관점이라 생각하고, 로킹, 데이터베이스 연결 등을 부가 관점으로 생각하면 된다.</li>
<li>프로그래머가 핵심 관점 코드에만 집중할 수 있게 될 뿐만 아닌 프로그램의 변경과 확장에도 유연하게 대응이 가능하다.</li>
</ol>

### 이식 가능한 서비스 추상화
<p>PSA(Portable Service Abstraction)</p>
<ol>
<li>스프링에서 제공하는 다양한 기술들을 추상화해 개발자가 쉽게 사용하는 인터페이스</li>
<li>예 : 클라이언트의 매핑과 클래스, 메서드의 매핑을 위한 애너테이션, JPA, MyBatis, JDBC</li>
</ol>

### 스프링 부트 스타터
<ol>
<li>스타터는 spring-boot-starter-{작업유형}이라는 명명규칙을 가짐</li>
<li>spring-boot-starter-web : Spring MVC를 사용해서 RESTful 웹 서비스를 개발할 때 필요한 의존성 모음.</li>
<li>spring-boot-starter-test : 스프링 애플리케이션을 테스트하기 위해 필요한 의존성 모음</li>
<li>spring-boot-starter-validation : 유효성 검사를 위해 필요한 의존성 모음</li>
<li>spring-boot-starter-actuator : 모니터링을 위해 애플리케이션에서 제공하는 다양한 정보를 제공하기 쉽게 하는 의존성 모음</li>
<li>spring-boot-starter-data-jap : ORM을 사용하기 위한 인터페이스의 모음인 JPA를 더 쉽게 사용하기 위한 의존성의 모음</li>
<li>어찌 가져오는지 궁금하다면</li>
<li><a href = "https://bit.ly/3N0vENa">스프링 공식 Dependency Versions 문서</a></li>
<li><a href = "https://bit.ly/40o8bZd">스타터 종류 참고(깃허브)</a></li>
</ol>

### 자동 구성 (알아놓으면 좋은 부분!)
<ol>
<li>스프링 부트는 서버를 시작할 때 구성 파일을 읽어와서 설정한다.</li>
<li>자동 설정은 META-INF에 있는 spring.factories파일에 있다.</li>
</ol>


### 자바 17의 주요 특징
<ol>
<li>"""로 감싼 텍스트를 사용해서 여러 줄의 텍스트 표현이 가능하다</li>
<li>formatted()메서드</li>


```java
String textBlock17 = """
{
    "id": %d,
    "name": "%s"
}
""".formatted(2, "juice");
```
```JSON
{
    "id": 2,
    "name": "juice"
}

```
<li>레코드</li>
<ul>
<li>데이터 전달을 목적으로 하는 객체를 더 빠르고 간편하게 만들기 위한 기능이다.</li>
<li>상속이 불가능</li>
<li>파라미터에 정의한 필드는 private final로 정의된다.</li>
<li>게터를 자동으로 생성</li>
</ul>
<li>패턴 매칭 : 바로 형변환을 하는게 가능하다.</li>

```java 
//11 버전
if(o instanceof Integer){
    Integer i = (Integer) o
}
//17 버전
if(o instanceof Integer i){
    
}
```
<li>자료형에 맞는 case문 처리</li>

```java
static double getIntegerValue(Object o){
    return switch (o) {
      case Double d -> d.intValue();
      case Float f -> f.intValue();
      case String s -> Integer.parseInt(s);
      default -> 0d;
    };
}
```
<li>Servlet, JPA의 네임 스페이스가 Jakarta로 대체</li>
<li>GraalVM기반의 스프링 네이티브 공식 지원</li>
<ul>
<li>기본의 사용하던 자바 가상 머신에 비해 훨씬 빠르게 시작되며 더 적은 메모리 공간을 차지한다.</li>
<li>기존의 JVM 실행 파일과 비교해 네이티브 이미지를 사용하면 가동 시간이 짧아지고 메모리를 더 적게 소모한다.</li>
</ul>
</ol>

### @SprintBootApplication
<ol>
<li>@SpringBootConfiguration</li>
<li>@ComponentScan : 사용자가 등록한 빈을 읽고 등록한다.</li>
<ol>
<li>@Configuration</li>
<li>@Repository</li>
<li>@Controller, @RestController</li>
<li>@Service</li>
</ol>
<li>@EnableAutoConfiguration : 스프링 부트에서 자동 구성을 활성화하는 애너테이션</li>
</ol>

### 컨트롤러에 들어가는 애너테이션
<ol>
<li>@RestController : 라우터 역할을 하는 애너테이션</li>
<li>@RestController는 @Controller, @ResponseBody가 합쳐짐</li>
<li>@Controller에는 @Component가 포함됨</li>
<li>라우터 : HTTP 요청과 메서드를 연결하는 장치</li>
</ol>
</details>

<details>
<summary>3장 : 스프링 부트 3 구조 이해하기</summary>

### 스프링 부트 3 구조 살펴보기
<ol>
<li>프레젠테이션 계층 - 컨트롤러 : HTTP 요청을 받고 비즈니스 계층으로 전송하는 역할을 한다.</li>
<li>비즈니스 계층 - 서비스 : 모든 비즈니스 로직을 처리한다.</li>
<li>퍼시스턴스 계층 - 리포지터리 : 이 과정에서 데이터베이스에 접근하는 DAO객체를 사용한다. DAO는 데이터베이스 계층과 상호작용하기 위한 객체다.</li>
</ol>
<hr>
<ol>
<li>application.yml : 스프링 부트 서버가 실행되면 자동으로 로딩되는 파일. -> 파일을 작성할 때 들여쓰기로 계층 구조를 표현한다. (YAML)</li>
<li>build.grable
<ul>
<li>implementation : 프로젝트 코드가 컴파일 시점과 런타임에 모두 해당 라이브러리를 필요로 할때 사용</li>
<li>testImplementation : 프로젝트의 테스트 코드를 컴파일하고 실행할 때만 필요한 의존성을 설정, 테스트 코드에서만 사용, 메인 애플리케이션 코드에서는 사용 안함</li>
<li>runtimeOnly : 런타임에만 필요한 의존성을 지정, 컴파일 시에는 필요하지 않지만, 애플리케이션을 실행할 때 필요한 라이브러리 설정</li>
<li>compileOnly : 컴파일 시에만 필요, 런타임에는 포함되지 않아야 하는 의존성 지정</li>
<li>annotationProcessor : 컴파일 시에 애너테이션을 처리할 때 사용하는 도구의 의존성 지정</li>
</ul>
</li>
</ol>

<hr>
만약 실행이 되었을 때 Controller -> service -> repository순으로 실행된다.

### /test요청을 했을 때 흐름도
<ol>
<li>요청이 먼저 들어온다.</li>
<li>스프링 부트의 디스패처 서블릿이라는 녀석이 URL을 분석한다.</li>
<li>컨트롤러에 들어있는 메서드와 매칭이 되고 실행된다.</li>
<li>서비스 계층으로 넘어가서 로직을 수행한후 반환한 값을 JSON, XML 등 다양한 형태로 반환해준다.</li>
</ol>

</details>

## 유용한 페이지
<ul>
<li><a href = "https://www.diffchecker.com/">디프체커 </a>: 코드 서로 다른부분이 어떤건지 비교하기</li>
</ul>