<?php
class Usuario
{
    private $id;
    private $nome;
    private $email;
    private $senha;

    // Getters e Setters
    private function getId()
    {
        return $this->id;
    }
    private function getNome()
    {
        return $this->id;
    }
    private function getEmail()
    {
        return $this->id;
    }
    private function getSenha()
    {
        return $this->id;
    }
    public function setNome($nome)
    {
        $this->nome = $nome;
    }
    public function setEmail($email)
    {
        $this->email = $email;
    }
    public function setSenha($senha)
    {
        $this->senha = $senha;
    }
    public function checkUser($email)
    {
        $sql = "SELECT * FROM usuarios WHERE email = :e";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":e", $email);
        $stmt->execute();
        return $stmt->rowCount() > 0;
    }
     
    public function checkPass($email, $senha)
    {
        $sql = "SELECT * FROM usuarios WHERE email = :e AND senha = :s";
        $stmt = $this->pdo->prepare($sql);
        $stmt->bindValue(":e", $email);
        $stmt->bindValue(":s", $senha);
        $stmt->execute();
        return $stmt->rowCount() > 0;
    }

    public function connetcion()
    {
        try {
            $dns = "mysql:dbname=login,host=localhost";
            $user = "root";
            $pass = "";

            $this->pdo = new PDO($dns, $user, $pass);
            return true;
        } catch (PDOException $e) {
            return false;
        }

    }
}
?>