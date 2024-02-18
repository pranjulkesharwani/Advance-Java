<!DOCTYPE html>
<html lang="en">

<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Document</title>
</head>

<body>
    <% pageContext.setAttribute("value", 345); %>
        <% request.setAttribute("value", 456); %>
            <% session.setAttribute("value", 678); %>
                <% application.setAttribute("value", 789); %>

                    <hr>

                    ${value}<br>
                    ${value}<br>
                    ${value}<br>
                    ${value}

                    <hr>

                    ${pageScope.value}<br>
                    ${requestScope.value}<br>
                    ${sessionScope.value}<br>
                    ${applicationScope.value}
</body>

</html>