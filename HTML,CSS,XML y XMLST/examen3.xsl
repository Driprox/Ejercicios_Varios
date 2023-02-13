<?xml version="1.0" encoding="UTF-8"?>
<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:template match="/">
    <html>
      <body>
          <xsl:apply-templates select="ies/ciclos" />
      </body>
    </html>
  </xsl:template>
  <xsl:template match="/ies/ciclos">
    <ul><xsl:apply-templates select="ciclo" /></ul>
  </xsl:template>
  <xsl:template match="/ies/ciclos/ciclo">
    <li><xsl:apply-templates select="nombre" /></li>
  </xsl:template>
  <xsl:template match="/ies/ciclos/ciclo/nombre">
    <xsl:value-of select="." />
  </xsl:template>
</xsl:stylesheet>
