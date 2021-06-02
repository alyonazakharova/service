package com.bercut.service.utils;

import org.w3c.dom.Document;

import javax.xml.namespace.NamespaceContext;
import java.util.Iterator;

public class NamespaceResolver implements NamespaceContext {
    private final Document sourceDocument;

    public NamespaceResolver(Document document) {
        sourceDocument = document;
    }

    public String getNamespaceURI(String prefix) {
        if (prefix.equals("ber-ns0")) {
            return "http://www.bercut.com/spec/schema/skidka_ili_paket";
        } else if (prefix.equals("ber-sp")) {
            return "http://www.bercut.com/spec/dsi/ServiceProfile";
        }
        else throw new IllegalArgumentException();
    }

    public String getPrefix(String namespaceURI) {
        return sourceDocument.lookupPrefix(namespaceURI);
    }

    @SuppressWarnings("rawtypes")
    public Iterator getPrefixes(String namespaceURI) {
        return null;
    }
}
