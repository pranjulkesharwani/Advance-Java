<%--<%@ page import="java.util.HashMap" %>
    --%>
    <!DOCTYPE html>
    <html lang="en">

    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>Document</title>
    </head>

    <body>
        <h1>Next Page</h1>
        <hr>
        <%-- <% HashMap map=(HashMap)request.getAttribute("yam"); %>

            <%= map.get("3ab") %><br><br>
                <%= map.get("#er") %><br><br>
                    <%= map.get("int") %><br><br>
                        --%>

                        <%-- Yam 3ab : ${yam.3ab}<br><br>
                            Yam #er : ${yam.#er}<br><br>
                            Yam int : ${yam.int}
                            --%>
                            ${'int'}<br><br>
                            ${'444'}<br><br>

                            Attribute : ${'float'}
    </body>

    </html>