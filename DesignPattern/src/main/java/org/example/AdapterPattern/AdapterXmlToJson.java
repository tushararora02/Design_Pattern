package org.example.AdapterPattern;
import org.json.JSONObject;
import org.json.XML;
import org.json.JSONException;

public class AdapterXmlToJson implements JsonResponse {
    private XmlData xmlData;
    public static int PRETTY_PRINT_INDENT_FACTOR = 4;

    public AdapterXmlToJson(XmlData xmlData){
        this.xmlData=xmlData;
    }

    @Override
    public String getJson() {
        String jsonPrettyPrintString ="";
        try {
            JSONObject xmlJSONObj = XML.toJSONObject(xmlData.getXml_text());
            jsonPrettyPrintString= xmlJSONObj.toString(PRETTY_PRINT_INDENT_FACTOR);

        } catch (JSONException je) {
            System.out.println(je.toString());
        }
        return jsonPrettyPrintString;
    }
}
