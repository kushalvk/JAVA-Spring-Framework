<html>
<head>
    <title>bookmark</title>
    <link rel="stylesheet" href="style.css">
</head>
<body>
    <div class="header">
        <h1>Bookmark App</h1>
    </div>
    <input type="text" id="in">
    <div class="btn">
        <button onclick="save()">SAVE LINK</button>
        <button onclick="remove()">DELETE ALL</button>
        <button onclick="up()">UPDATE</button>
    </div>
    <div>Links</div><hr>
    <table border="1" id="out">
        <tr>
            <th>NO.</th>
            <th>LINKS</th>
        </tr>
    </table>
</body>
<script src="script.js"></script>
</html>