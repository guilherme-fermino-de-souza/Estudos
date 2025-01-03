<?php 
    class Pessoa{
        //Atributos
        private $nome;
        private $idade;

        //Getters e setters
        public function setNome($nome) {
            $this -> nome = $nome;
        }
        private function getNome() {
            return $this -> nome;
        }
        public function setIdade($idade) {
            if($idade<=0) {
                echo "Idade inválida";
            } else {
            $this -> idade = $idade;
            }
        }

        private function getIdade() {
            return $this -> idade;
        }

        public function exibirValores() {
            echo "<h1>" . $this-> getIdade() . "</h1>";
            echo "<h1>" . $this-> getNome() . "</h1>";
        }
    }
?>
