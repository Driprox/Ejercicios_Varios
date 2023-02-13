<?xml version="1.0" encoding="UTF-8"?> 
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
<xsl:template match="/">
<html> 
<body>
  <h2>Lista de Salario</h2>
  <div>
<xsl:for-each select="/empleados/empleado">
<xsl:if test= "sueldo>2000">
<ul>
    <li>
		<xsl:value-of select="nombre"/>,
		<xsl:value-of select="apellido1"/>
    <xsl:value-of select="apellido2"/> 
		</li>		
</ul>
</xsl:if>
</xsl:for-each>
</div>
</body>
</html>
</xsl:template>
</xsl:stylesheet>