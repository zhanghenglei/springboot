<!DOCTYPE html>
<html xmlns="http://www.w3.org/1999/xhtml" xmlns:th="http://www.thymeleaf.org"
      xmlns:sec="http://www.thymeleaf.org/thymeleaf-extras-springsecurity3">
    <head>
        <title>Hello World!</title>
    </head>
    <body>
       <center>
       <p>
           welcome ${name} to freemarker!
       </p>

       <p>性别：
           <#if sex=='man'>
                  男
           <#elseif sex=='women'>
                  女
           <#else>
                  保密
           </#if>
        </p>
       </center>
    </body>
</html>