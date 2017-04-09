<html>
<head>
    <title></title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
</head>
<body>
<h1>이선호 프론트엔드 알려주기</h1>
<button id="loadBtn">가져와</button>
<div id="test">

</div>
<script>
    $("#loadBtn").click(function(){
        $.get( "/friend", function( data ) {
            for(var i in data)
           $('#test').append(data[i]['name'] + ' ');
        });
    });
</script>
</body>
</html>