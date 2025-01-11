<?php require("conexao.php"); ?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Consulta com parâmetro</title>

    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootsrap/4.1.3/css/bootstrap.min.css">
</head>
<body>

    <header>

    </header>
    
    <section>
        <h1> Gênero </h1>
    </section>

<!----------------------------------------Pesquisa----------------------------------->
    <section>
        <div>
            <h2> Pesquisar </h2>
        </div>

        <form method="post">
            <div>
                <input type="text" placeholder="Pesquisar por nome" name="txPesquisar" required />
            </div>

            <div>
                <button> Pesquisar </button>
            </div>

        </form>
    </section>

<!---------------------------------Formulário de Edição------------------------------------------->
    <section style="border: 1px solid blue; margin: 50px 0; padding: 20px 0;">
        <div>
            <h2> Edição dos Dados </h2>
        </div>

        <form action="genero-alterar.php" method="post">
            <div>
                <input type="hidden" placeholder="ID" name="txId" value="<?php echo @$_GET['id']; ?>" />
            </div>

            <div>
                <input type="text" placeholder="Gênero" name="txGenero" value="<?php echo @$_GET['genero']; ?>" />
            </div>

            <div>
                <input type="button" value="Salvar">
            </div>
        </form>
    </section>

    <section>

        <table class="table table-striped">
            <thead>
                <tr>
                    <th scope="col">Id</th>
                    <th scope="col">Gênero</th>
                    <th scope="col">Rotinas</th>
                </tr>
            </thead>
            <tbody>
                <?php 
                    try{

                        if(isset($_POST['txPesquisar'])){
                            $nome = $_POST['txPesquisar'];
                            $stmt = $conn -> prepare("select * from tbGenero where genero = '$nome'");
                        } else {
                            $stmt = $conn -> prepare("select * from tbGenero");
                        }    

                        $stmt -> execute();

                        while($row = $stmt ->fetch(PDO::FETCH_BOTH)) {
                            echo "<tr>";
                                echo "<td> $row[idGenero] </td>";
                                echo "<td> $row[genero] </td>";
                                echo "<td>";
                                    echo "<a href='?id=$row[idGenero]&genero=$row[genero]'>";
                                        echo "Alterar";
                                    echo "</a>";
                                echo "</td>";
                            echo "</tr>";
                        }
                    }
                    catch(PDOException $e) {
                        echo "Erro" . $e -> getMessage();
                    }
                ?>
            </tbody>
    </section>

    <footer>

    </footer>
</body>
</html>
