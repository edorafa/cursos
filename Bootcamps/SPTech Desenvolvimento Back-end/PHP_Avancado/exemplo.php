<?php

define('WWW_ROOT' , dirname( __FILE__));
define( 'DS' , DIRECTORY_SEPARATOR);

require_once (WWW_ROOT . DS . 'vendor/autoload.php');
use Classes\Search;

$busca = new Search();

$resultado = $busca->getAddressFromZipCode('01001000');
print_r($resultado);