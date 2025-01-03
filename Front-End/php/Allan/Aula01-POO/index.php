<?php require("Pessoa.php")?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>
<body>

    <?php 

    //Exemplo 01
      /*$pessoa1 = new Pessoa();

      //atribuir valor a um atributo
      $pessoa1 -> nome ="Ana";
      $pessoa1 -> idade = 28;
        
      //exibindo valores dos atributos
      echo $pessoa1 -> nome;
      echo $pessoa1 -> idade;
      */
    //Exemplo 02 
      /*$pessoa1 = new Pessoa();

      $pessoa1->setNome("Ana");
      echo $pessoa1->getNome();

      $pessoa1->setIdade(-24);
      echo $pessoa1->getIdade();
      */
    //Exemplo 03
        $pessoa1 = new Pessoa();

        $pessoa1->setNome("Ana");
        $pessoa1->setIdade(24);

        $pessoa1 -> exibirValores();

    ?>
    
</body>
</html>
