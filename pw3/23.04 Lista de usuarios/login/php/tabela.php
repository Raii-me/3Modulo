<?php
require '../php/Usuario.class.php';
$usuario = new Usuario();
$con = $usuario->conecta();

if (!$con) {
    echo "banco indisponivel";
    exit();

} else {
    $usuarios = $usuario->listarUsuarios();
    //montar montagem da tabela
    $table = '<table>';
    $table .= '<thead>';
    $table .= '<tr>';
    $table .= '<td>Codigo</td>';
    $table .= '<td>Name</td>';
    $table .= '<td>Email</td>';
    $table .= '</tr>';
    $table .= '<tbody';


    //laço de repetição para incluir dos dados na tabela
    foreach ($usuarios as $item) {
        $id = $item['id'];
        $nome = $item['nome'];
        $email = $item['email'];
        
        $table .= '<tr>';
        $table .= "<td>$id</td>";
        $table .= "<td>$nome</td>";
        $table .= "<td>$email</td>";
        $table .= '</tr>';

    }

    $table .= '</body';
    $table .= '</thead>';
    $table .= '</table>';

}
echo $table;