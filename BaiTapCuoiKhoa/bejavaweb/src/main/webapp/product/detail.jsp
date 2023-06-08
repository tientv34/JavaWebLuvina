<!doctype html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>Document</title>
</head>
<body>
    <div class="product">
        <table item="item">
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>Brand</th>
                <th>Price</th>
                <th>Made in</th>
            </tr>

            <tr>
                <td>${item.id}</td>
                <td>${item.name}</td>
                <td>${item.brand}</td>
                <td>${item.price}</td>
                <td>${item.madein}</td>
            </tr>
        </table>
    </div>
</body>
</html>