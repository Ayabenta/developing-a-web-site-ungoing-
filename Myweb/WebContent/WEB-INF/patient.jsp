<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="utf-8" />
        <title>Myappservlet</title>
    </head>
    <body>
        <p>Bienvenue Aya Bentaleb! veuillez choisir votre maladie</p>
        <p> </p>
        
        <form  action="" method="post"> 
        <label for ="Gmail"> Gmail : </label>
        <input type ="text" name= "Gmail">
        <p> </p> 
        <select name = "maladie">
            <option>Selectionnez</option>
            <option value="Troubles anxieux. Phobie. Anxiété généralisée. Trouble panique et agoraphobie">Troubles anxieux. Phobie. Anxiété généralisée. Trouble panique et agoraphobie</option>
            <option value ="Troubles obsessionnel-compulsif (TOC)">Trouble obsessionnel-compulsif (TOC)</option>
            <option value = "Troubles de l'humeur. Dépression. Troubles bipolaires">Troubles de l'humeur. D�pression. Troubles bipolaires</option>
        </select>
        <button type="submit">valider</button>

        </form>
        
       
        
        
        
    </body>
</html>