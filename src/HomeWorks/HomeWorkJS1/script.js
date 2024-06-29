document.write("<table border='1' width='260'>");
for (let i = 1; i < 11; i++) {
    document.write("<tr>");
    for (let j = 1; j < 11; j++) {
        if((i + j) % 2 == 0)
            document.write("<td bgcolor='red'>" + i * j + "</td>");
        else
            document.write("<td bgcolor='yellow'>" + i * j + "</td>");
    }
    document.write("</tr>");
}
document.write("</table>");