NativeButton button = new NativeButton("Navigate to company");
button.addClickListener( e-> {
  button.getUI().ifPresent(ui -> ui.navigate("company"));
});
