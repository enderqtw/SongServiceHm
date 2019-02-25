<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>Song Service</title>
    <link rel="stylesheet"
          href="https://bootswatch.com/4/minty/bootstrap.min.css" />

</head>
<body>
<nav class="navbar navbar-expand-lg navbar-dark bg-primary">
    <a class="navbar-brand" href="/">Home</a>
    <a class="navbar-brand" href="/songs">All songs</a>
</nav>
<div class="container">
    <div class="page-header"><h1>${songs[1].genre} genre songs.</h1></div>
    <div class="row">
        <div class="col">
            <ul class="list-group">
                <#list songs as song>
                    <li class="list-group-item">
                        Song name: ${song.name}, <br/>
                        Artist: <a href="/song/artist/${song.artist}">${song.artist}</a>, <br/>
                        Release year: <a href="/song/year/${song.releaseYear?c}">${song.releaseYear}</a>, <br/>
                        Genre: ${song.genre}
                    </li>
                </#list>
            </ul>
        </div>
    </div>
</div>
<script src="https://bootswatch.com/_vendor/jquery/dist/jquery.min.js"></script>
<script src="https://bootswatch.com/_vendor/popper.js/dist/umd/popper.min.js"></script>
<script src="https://bootswatch.com/_vendor/bootstrap/dist/js/bootstrap.min.js"></script>
</body>
</html>