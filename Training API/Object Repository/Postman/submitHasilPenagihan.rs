<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>submitHasilPenagihan</name>
   <tag></tag>
   <elementGuidId>7801466e-3ebc-412c-992f-b39e2b30bfb4</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n    \&quot;penagih_id\&quot;: \&quot;${GlobalVariable.IDpenagih}\&quot;,\n    \&quot;no_akh\&quot;: \&quot;${GlobalVariable.NoAKH}\&quot;,\n    \&quot;no_agreement\&quot;: \&quot;${GlobalVariable.Noagrmnt}\&quot;,\n    \&quot;status_alamat_penagihan\&quot;: \&quot;STAL001\&quot;,\n    \&quot;lokasi_penagihan_id\&quot;: \&quot;LKPE001\&quot;,\n    \&quot;bertemu_dengan_id\&quot;: \&quot;BEDG001\&quot;,\n    \&quot;nama_ditemui\&quot;: \&quot;SULASMONI\&quot;,\n    \&quot;rencana_id\&quot;: \&quot;1\&quot;,\n    \&quot;alasan_id\&quot;: \&quot;1\&quot;,\n    \&quot;sub_alasan_id\&quot;: \&quot;1\&quot;,\n    \&quot;tanggal_janji_bayar\&quot;: \&quot;2024-02-19\&quot;,\n    \&quot;sp_diberikan\&quot;: \&quot;0\&quot;,\n    \&quot;status_unit_id\&quot;: \&quot;SUAK001\&quot;,\n    \&quot;catatan\&quot;: \&quot;TEST\&quot;,\n    \&quot;image\&quot;: \&quot;\&quot;,\n    \&quot;latitude\&quot;: \&quot;-6.2171117\&quot;,\n    \&quot;longitude\&quot;: \&quot;106.8304483\&quot;\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>3190d256-12f7-4bf2-9d5e-e5d3021c439e</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Authorization</name>
      <type>Main</type>
      <value>Basic c2F5YSM0ZGFsYWh1czNyKmptcG1maSE6am1wbWYhQDIwMjIqYXBpPWtlcmVu</value>
      <webElementGuid>24da5a51-48fb-425b-b82c-61684a62bc74</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>9.3.0</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://colldev.jaccs-mpmfinance.com/collection-mobile-services/api/v1/submitHasilPenagihan</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
