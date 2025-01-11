<?php 
    include("conexao.php");
    $id = $_POST['txId'];
    $genero = $_POST['txGenero'];
    
    $stmt = $conn->prepare("
    UPDATE tbGenero SET
        genero='$genero'
        WHERE idGenero = '$id';
        ");
        $stmt -> execute();

        header("location: index.php");
?>
