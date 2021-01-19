<?php

$categorias = ['infantil', 'adolescente', 'adulto', 'idoso'];

$nome = $_POST['nome'];
$idade = $_POST['idade'];

if(empty($nome))
{
    echo 'O nome não pode ser vazio';
    return;
}

if(strlen($nome) < 3){
    echo 'O nome deve conter mais de 3 caracteres';
    return;
}

if(strlen($nome) > 40) {
    echo 'O nome é muito extenso';
    return;
}

if(!is_numeric($idade)){
    echo 'Informe um número para a idade';
    return;
}

if($idade >= 6 && $idade <= 12) {
    competidor($nome, 'infantil');
}

else if ($idade >= 13  && $idade <= 18){
    competidor($nome, 'adolescente');
}

else {
    competidor($nome, 'adulto');
}

function competidor($nome, $categoria){
    echo("O competidor" .$nome . " esta na categoria " .$categoria);
}

?>