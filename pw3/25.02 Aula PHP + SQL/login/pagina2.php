<?php

session_start();
if(isset($_SESSION["user"])){
   echo "O ", $_SESSION["user"] , "!";
}else{
    echo "Não há nome salvo na sessao";
}

?>
