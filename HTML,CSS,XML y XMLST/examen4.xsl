<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet version="1.0" xmlns:xsl="http://www.w3.org/1999/XSL/Transform">
<xsl:template match="/">
<html> 
<body>
  <h1>Tabla examen</h1>
  <table border="1">
    <xsl:for-each select="ies/ciclos/ciclo">
    <tr>
      <td><xsl:value-of select="nombre"/></td>
    </tr>
    </xsl:for-each>
  </table>
</body>
</html>
</xsl:template>
</xsl:stylesheet>