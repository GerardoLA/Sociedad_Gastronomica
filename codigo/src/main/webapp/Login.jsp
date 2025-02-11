<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Login</title>
    <link rel="stylesheet" href="styles/Login.css">
</head>
<body>
    <form class="form" method="post" action="Inicio">
        <h2 class="form_title">Inicia Sesión</h2>
        <p class="form_paragraph">¿Aún no tienes cuenta?<a href="#" class="form_link">Entra aquí</a></p>

        <div class="form_container">
            <div class="form_group">
                <input type="number" name="id" id="id" class="form_input" placeholder=" ">
                <label for="id" class="form_label">Id</label>
                <span class="form_line"></span>
            </div>
            <div class="form_group">
                <input type="password" name="password" id="password" class="form_input" placeholder=" ">
                <label for="password" class="form_label">Password</label>
                <span class="form_line"></span>
            </div>

            <input type="submit" value="Entrar" class="form_submit">
            
        </div>
    </form>
    
</body>
</html>
