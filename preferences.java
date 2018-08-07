// Reacting to changes in the preferences
// source: http://www.vogella.com/tutorials/EclipsePreferences/article.html#reacting-to-changes-in-the-preferences

Activator.getDefault().getPreferenceStore()
    .addPropertyChangeListener(new IPropertyChangeListener() {
        @Override
        public void propertyChange(PropertyChangeEvent event) {
            if (event.getProperty() == "MySTRING1") {
                String value = event.getNewValue().toString()
                // do something with the new value
            }
        }
    });
    
    
    
    // Field Editors: https://www.eclipse.org/articles/Article-Field-Editors/field_editors.html
