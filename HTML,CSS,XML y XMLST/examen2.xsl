<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">  
  <xsl:template match="/">
    <html>
      <body>
        <xsl:apply-templates select="ies/ciclos/ciclo/nombre" />
      </body>
    </html>
  </xsl:template>
  <xsl:template match="/ies/ciclos/ciclo/nombre">
    <p><xsl:value-of select="."/></p>
  </xsl:template>
</xsl:stylesheet>
