<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>GET 방식 요청</h3>
<h4>form 태그를 이용한 get 방식 요청</h4>
<form action="querystring" method="get">
<label>이름: </label><input type="text" name= "name"> <br>
<label>나이: </label><input type= "number" name="age"> <br>
<label>생일: </label><input type= "date" name="birthday"><br>
<label>성별: </label>
<input type = "radio" name="gender" id="male" value="M"> <label for="male"남자></label>
<input type = "radio" name="gender" id="female" value="f"> <label for="female"여자></label>

<br>
<label> 국적:</label>
<select name= "national">
  <option value= "ko" >한국</option>
  <option value= "ch"> 중국 </option>
  <option value="jp"> 일본</option>
  <option value="etc"> 기타 </option>
</select> <br>
<label> 취미 :</label>
<input type="checkbox" name="hobbies" id="movie" value="movie"> <label for="movei">영화</label>
<input type="checkbox" name="hobbies" id="music" value="music"> <label for="music">음악감상</label>
<input type="checkbox" name="hobbies" id="sleep" value="sleep"> <label for="sleep">취침</label>
<br>
<input type="submit" value="GET 요청"> 
</form>

<h4>a 태그의 href 속성을 이용한 get 방식 요청</h4>
<a href="querystring?name=aaa&age=12&birthday=2024-06-04&gender=f&national=ch&hobbies=music"> 쿼리스트링을 이용한 값 전달</a>

<h3>POST 방식 요청(form 태그 이용)</h3>
<form action="formdata" method="post">
<label>이름: </label><input type="text" name= "name"> <br>
<label>나이: </label><input type= "number" name="age"> <br>
<label>생일: </label><input type= "date" name="birthday"><br>
<label>성별: </label>
<input type = "radio" name="gender" id="male2" value="M"> <label for="male2"남자></label>
<input type = "radio" name="gender" id="female2" value="f"> <label for="female2"여자></label>

<br>
<label> 국적:</label>
<select name= "national">
  <option value= "ko" >한국</option>
  <option value= "ch"> 중국 </option>
  <option value="jp"> 일본</option>
  <option value="etc"> 기타 </option>
</select> <br>
<label> 취미 :</label>
<input type="checkbox" name="hobbies" id="movie2" value="movie2"> <label for="movei">영화</label>
<input type="checkbox" name="hobbies" id="music2" value="music2"> <label for="music">음악감상</label>
<input type="checkbox" name="hobbies" id="sleep2" value="sleep2"> <label for="sleep">취침</label>
<br>
<input type="submit" vlaue="POST 요청"> 
</form>



</body>
</html>