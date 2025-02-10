<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="{{url('assets/css/style.css')}}">
    <script src="{{url('assets/js/script.js')}}"></script>
    <title>Document</title>
</head>
<body>
    <header>
        <nav>
            <ul>
                <li><a href="/">Home</a></li>
                <li><a href="/quemsomos">Quem Somos</a></li>
                <li><a href="/contato">Contato</a></li>
            </ul>
        </nav>
    </header>

    @yield('content') <!---=-------------------Parte onde o conteúdo é inserido------------------------------------------------>

    <footer>
        <p> Todos os direitos reservados pelo homies.</p>
    </footer>
</body>
</html>
