# 타임리프(Thymeleaf)
- 타임리프는 컨트롤러가 전달하는 데이터를 이용해 동적으로 화면을 만들어주는 역할을 하는 view 템플릿 엔진이다.
- 스프링부트에서는 공식적으로 VIEW영역에서 JSP의 사용을 권장하지 않습니다.

<img src="https://github.com/to7485/Web1500/assets/54658614/d5d4ff17-44c6-4513-b2bc-4b55e7242a63" width="60%" height="60%">


- 가능하다면 JSP를 피하고 Thymeleaf와 같은 템플릿 엔진을 사용하라고 권장하고 있다.


## Thymeleaf가 제공해주는 템플릿
- Thymeleaf는 2개의 Markup Template Mode(HTML,XML)가 있고 3개의 Textual Template Mode(TEXT, Javascript, CSS)가 있고 1개의 no-op Template Mode(Raw)가 있다.
  - HTML
  - XML
  - TEXT
  - JavaScript
  - CSS
  - Raw

## 타임리프의 특징
- 서버상에서 동작하지 않아도 HTML파일의 내용을 바로 확인 가능하다.
  - JSP와 같은 경우 서버를 구동하지 않고 해당 파일을 열게되면 JSP코드와 HTML이 섞여있어서 정상적인 확인이 불가능했다.
  - 반면 타임리프는 화면 구성을 서버 가동없이 쉽게 파악할 수 있어 개발에 수정할때마다 서버 재가동이 필요없어지기 때문에 개발에 용이하다.
- 순수 HTML구조를 유지한다.

## Thymeleaf의 장점
- 코드를 변경하지 않기 때문에 디자인팀과 개발 팀간의 협업이 편해진다.
- JSP와 달리 Servlet Code로 변환되지 않기 때문에 비즈니스 로직과 분리되어 오로지 View에 집중할 수 있다.
- 서버상에서 동작하지 않아도 되기 때문에 서버 동작 없이 화면을 확인할 수 있다. 때문에 더미 데이터를 넣고 화면 디자인 및 테스트에 용이하다.

# Ex_날짜_Thymeleaf 프로젝트 생성하기
- pom.xml, resources의 패키지 옮기기, 나머지 xml파일들 지우기

## Thymeleaf사용을 위한 라이브러리 추가하기
- 스프링 MVC에서 타임리프는 뷰 영역에 해당한다. 스프링 MVC의 구성 요소에 대해 설명할 때 뷰 영역과 관련된 구성 요소는 ViewResolver와 View였다. 타임리프는 thymeleaf-spring5 모듈을 제공하는데 이 모듈에 타임리프 연동을 위한 ViewResolver와 View 구현 클래스가 존재한다. 스프링 MVC에서 타임리프가 제공하는 ViewResolver를 사용하도록 설정하면 결과를 타임리프 템플릿을 이용해서 생성할 수 있다.

- 스프링 MVC와 타임리프를 연동하려면 먼저 타임리프의 스프링 연동 모듈을 의존에 추가해야 한다. 다음의 세 가지(thymeleaf-spring5, thymeleaf-extras-java8time, thymeleaf-layout-dialect) 의존 설정을 추가한다.
```
<dependency>
	<groupId>org.thymeleaf</groupId>
	<artifactId>thymeleaf-spring5</artifactId>
	<version>3.0.15.RELEASE</version>
</dependency>
<dependency>
	<groupId>org.thymeleaf.extras</groupId>
	<artifactId>thymeleaf-extras-java8time</artifactId>
	<version>3.0.4.RELEASE</version>
</dependency>
<dependency>
	<groupId>nz.net.ultraq.thymeleaf</groupId>
	<artifactId>thymeleaf-layout-dialect</artifactId>
	<version>3.1.0</version>
</dependency>
```
- thymeleaf-spring5 모듈은 스프링 MVC에서 타임리프를 뷰로 사용하기 위한 기능을 제공한다. 
- thymeleaf-extras-javaStime은 LocalDateTime과 같은 자바 8의 시간 타입을 위한 추가 기능을 제공한다.
- thymeleaf-layout-dialect은 페이지 레이아웃 기능을 사용하기 위한 추가 기능을 제공합니다.
- 의존을 추가했다면 스프링 MVC가 타임리프를 사용하도록 ViewResolver를 설정한다. 이를 위한 설정 코드는 다음과 같다.

## Servlet_Context에 코드 수정하기
```java
package mvc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.DefaultServletHandlerConfigurer;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.thymeleaf.extras.java8time.dialect.Java8TimeDialect;
import org.thymeleaf.spring5.SpringTemplateEngine;
import org.thymeleaf.spring5.templateresolver.SpringResourceTemplateResolver;
import org.thymeleaf.spring5.view.ThymeleafViewResolver;

import com.korea.test3.HomeController;

import nz.net.ultraq.thymeleaf.layoutdialect.LayoutDialect;


@Configuration
@EnableWebMvc
//@ComponentScan("com.korea.test3")
public class ServletContext1 implements WebMvcConfigurer {
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Override
	public void configureDefaultServletHandling(DefaultServletHandlerConfigurer configurer) {
		configurer.enable();
	}

	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/resources/**").addResourceLocations("/resources/");
	}
	
	@Bean
	public SpringResourceTemplateResolver templateResolver() {
		SpringResourceTemplateResolver templateResolver = new SpringResourceTemplateResolver();
		templateResolver.setApplicationContext(applicationContext);
		//templateResolver.setPrefix("/WEB-INF/views/");
		//templateResolver.setSuffix(".html");
		templateResolver.setCacheable(false);
		return templateResolver;
	}
	
	//타임리프의 템플릿 엔진을 선정한다. 템플릿 파일을 읽어올 때 선언한 TemplateResolver를 사용한다.
	@Bean
	public SpringTemplateEngine templateEngine() {
		SpringTemplateEngine templateEngine = new SpringTemplateEngine();
		templateEngine.setTemplateResolver(templateResolver());
		templateEngine.setEnableSpringELCompiler(true);
		templateEngine.addDialect(new Java8TimeDialect()); //자바8의 시간타입을 지원하기 위한 Dialect 추가
		templateEngine.addDialect(new LayoutDialect()); //개선된 레이아웃 추가 기능을 위해 LayoutDialect 역시 추가
		return templateEngine;
	}

	@Bean
	public ThymeleafViewResolver thymeleafViewResolver() {
		ThymeleafViewResolver resolver = new ThymeleafViewResolver();
		resolver.setContentType("text/html");
		resolver.setCharacterEncoding("utf-8");
		resolver.setTemplateEngine(templateEngine());
		return resolver;
	}
		
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		registry.viewResolver(thymeleafViewResolver());
	}

//	  @Bean 
//	  public InternalResourceViewResolver resolver() {
//	  InternalResourceViewResolver resolver = new InternalResourceViewResolver();
//	  resolver.setViewClass(JstlView.class); resolver.setPrefix("/WEB-INF/views/");
//	  resolver.setSuffix(".jsp"); return resolver; }
		 
}

```

# Thymeleaf 기본문법

## 설정
- **xmlns:th=""**

```html
<html lang="en" xmlns:th="http://www.thymeleaf.org">
```
- Thymeleaf의 th속성을 사용하기 위해 선언된 네임스페이스이다.
- 순수 HTML로만 이루어진 페이지인 경우 선언하지 않아도 된다.

---

## 기본 기능
- 타임리프는 크게 변수식, 페이지식, 링크 식의 세 가지 식과 선택 변수 식을 제공한다.
	- <b>변수 식: </b> ${OGNL}
	- <b>메시지 식:</b> #{코드}
	- <b>링크 식 :</b> @{링크}
	- <b>선택 변수 식 :</b> \*{OGNL}

※OGNL : 자바 언어가 지원하는 범위보다 더 단순한 식을 사용하면서 속성(자바빈즈에서 발견되는 setProperty와 getPeroperty 메소드를 통해)을 가져오고 설정하는 것을 허용하고 자바 클래스의 메소드를 실행하는 오픈 소스 표현식 언어(EL)이다. 

<br>

1. **th:text="${}"**

```html
<div th:text="${data}"></div>
```
- JSP의 EL표현식인 ${}와 마찬가지로 ${}표현식을 사용해서 컨트롤러에서 전달받은 데이터에 접근할 수 있다.<br>

<br>

2. **th:href="@{}"**

```html
 <a th:href="@{/boardListPage?currentPageNum={page}}"></a>
```
- <a>태그의 href 속성과 동일하다.
- 괄호안에 클릭시 이동하고자 하는 url을 입력하면 된다.
	
- 링크의 일부를 식으로 변경하고 싶다면 경로에 {변수}를 사용할 수 있다. 

```html
<a href="#" th:href="@{/members/{memId}(memId=${mem.id})}"></a>
```

- 위 코드에서 링크 식의 {memId}는 경로 변수이다. 경로 변수 memId에 넣을 값을 뒤에 붙인 괄호 안에 지정한다. 위 코드에서 뒤에 붙인 (memId\=${memId})는 경로 변수 memId의 값으로 ${mem.id}를 사용한다는 것을 뜻한다.
	
	
<br>
	
3. **th:with="${}"**
```html
<div th:with="userId=${number}" th:text="${usesrId}">
```
- 변수형태의 값을 재정의하는 속성이다. 즉 **th:with**를 이용하여 새로운 변수값을 생성할 수 있다.<br>

<br>
	
4. **th:value="${}"**
```html
<input type="text" id="userId" th:value="${userId} + '의 이름은 ${userName}"/>
```
- input의 value에 값을 삽입할 때 사용한다.
- 여러개의 값을 넣을땐 + 기호를 사용한다.

---
	
## 타임리프 식 객체
- 타임리프는 식에서 사용할 수 있는 객체를 제공한다. 이 식 객체를 이용하면 문자열 처리나 날짜 형식 변환 등의 작업을 할 수 있다. "#객체명"을 사용해서 식 객체를 사용한다. 
- 다음은 dates, 식 객체를 이용해서 Date 타입 변수 값을 형식에 맞게 출력하는 예이다.

```
<span th:text="${#dates.format(date, 'yyyy-MM-dd')}">date</span>
```

- 각 식 객체는 기능이나 속성을 제공한다. dates 식 객체의 경우 format을 비롯해 날짜 형식 포맷팅을 위한 다양한 기능을 제공한다. 

### 타임리프가 제공하는 주요 식 객체

- #strings : 문자열 비교, 문자열 추출 등 String 타입을 위한 기능 제공
- #numbers : 포맷팅 등 숫자 타입을 위한 기능 제공
- #dates, #calendars, #temporals : Date타입과 Calendar 타입, LocalDateTIme 타입을 위한 기능 제공
- #lists, #sets, #maps : List, Set, Map을 위한 기능 제공
	
## ThymeController 생성하기
```java
package com.korea.test3;

import java.time.LocalDateTime;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Handles requests for the application home page.
 */
@Controller
public class ThymeController {
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/")
	public String home(Model model) {
		model.addAttribute("data","타임리프 예제입니다.");
		
		return "/WEB-INF/views/ex01.html";
	}	
}

```
	
## ThymeController 객체 생성하기
- Servlet_Context 클래스에 객체 생성하기
```java
@Bean
public ThymeController thymeController() {
	return new ThymeController();
}
	
```
	
## views 폴더에 ex01.html 생성하기
```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
<head>
    <meta charset="utf-8">
    <title>Title</title>
</head>
<body>
    <p th:text="${data}">Hello Thymeleaf!!</p>
</body>
</html>

```

![image](https://github.com/to7485/Web1500/assets/54658614/cb1f90c5-3226-4939-8fff-c681fcef2cc6)


# Controller에서 객체 받아서 출력하기

## MemberVO 클래스 생성하기
```
package vo;

import java.time.LocalDateTime;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class MemberVO {

	private Long memNo;
	private String memId;
	private String memNm;
	private LocalDateTime regDt;
	private LocalDateTime modDt;
}
```
	
## ThymeController 코드 추가하기
```
@RequestMapping("/ex02")
public String ex02(Model model) {
	MemberVO vo = new MemberVO();

	vo.setMemNo(1L);
	vo.setMemId("user1");
	vo.setMemNm("이름1");
	vo.setRegDt(LocalDateTime.now());

	model.addAttribute("vo",vo);
	return "/WEB-INF/views/ex02.html";
}
```
	
## views에 ex02.html 생성하기
```
<!DOCTYPE html>
<html xmlns:th="http://www.thymeleaf.org">
	<head>
		<meta charset="UTF-8">
		<title>Insert title here</title>
	</head>
	<body>
		<h1>회원정보 출력 예제</h1>
		<div>
			회원번호 : <span th:text="${vo.memNo}"></span>
		</div>
				<div>
			아이디 : <span th:text="${vo.memId}"></span>
		</div>
				<div>
			이름 : <span th:text="${vo.memNm}"></span>
		</div>
				<div>
			가입일시 : <span th:text="${#temporals.format(vo.regDt, 'yyyy-MM-dd HH:mm:ss')}"></span>
		</div>
		
	</body>
</html>	
```

![image](https://github.com/to7485/Web1500/assets/54658614/0b9cee16-1bcb-4b3d-981e-5d89ffe64346)























