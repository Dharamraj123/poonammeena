<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
   <table cellpadding = "15" border = "5">
       <tr>
          <th>Warehouse</th>
          
          <th>stock</th>
          
          <th>products</th>   
      </tr>
      <tr>
          <td>C1</td>
          <td>A</td>
          <td>3KG</td>
          
      </tr>    
   
       <tr>
          <td>C1</td>
          <td>B</td>
          <td>2KG</td>
      </tr>    
       <tr>
          <td>C1</td>
          <td>C</td>
          <td>8KG</td>
      </tr>
       <tr>
          <td>C2</td>
          <td>D</td>
          <td>12KG</td>
      </tr>    
       <tr>
          <td>C2</td>
          <td>E</td>
          <td>25KG</td>
      </tr>    
       <tr>
          <td>C2</td>
          <td>F</td>
          <td>15KG</td>
      </tr>    
       <tr>
          <td>C3</td>
          <td>G</td>
          <td>0.5KG</td>
      </tr>    
       <tr>
          <td>C3</td>
          <td>H</td>
          <td>1KG</td>
      </tr>    
       <tr>
          <td>C3</td>
          <td>I</td>
          <td>2KG</td>
      </tr>        
   </table>  
  
  
  
  
    <form action="add">
    <br><br>
    NOTE :--Select product as per your need but you have to enter product into it's cell <br>
            -----------if you don't wants that product then fill "0"  in that cell--------------------- <br><br><br>
  
    Enter total weigh from C1 warehouse<input type = "text" name = "C1" maxlength="1" required><input type = "text" name = "C11" maxlength="1" required><input type = "text" name = "C111" maxlength="1" required><br><br><br>
    Enter total weigh from C2 warehouse<input type = "text" name = "C2" maxlength="1" required><input type = "text" name = "C22" maxlength="1" required><input type = "text" name = "C222" maxlength="1" required><br><br><br>
    Enter total weigh from C3 warehouse<input type = "text" name = "C3" maxlength="1" required><input type = "text" name = "C33" maxlength="1" required><input type = "text" name = "C333" maxlength="1" required><br><br><br>
    <br>
     
    
    
    
    
    
    
    <input type= "submit" value="add"  name= "add"/>
    </form>
     
</body>
</html>