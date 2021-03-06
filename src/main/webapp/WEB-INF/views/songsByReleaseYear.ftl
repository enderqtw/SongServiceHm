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
    <div class="page-header"><h1>Songs of ${songs[1].releaseYear?c}.</h1></div>
    <div class="row">
        <div class="col">
            <ul class="list-group">
                <#list songs as song>
                    <li class="list-group-item">
                        Song name: ${song.name}, <br/>
                        Artist: <a href="/song/list/${song.artist}">${song.artist}</a>, <br/>
                        Release year: ${song.releaseYear}, <br/>
                        Genre: <a href="/song/genre/${song.genre}">${song.genre}</a>
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