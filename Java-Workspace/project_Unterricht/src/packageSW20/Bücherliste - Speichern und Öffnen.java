public void save() 
	{
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showSaveDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			saveText(file);
		}
	}

public void saveText(File file) 
        {
		// TODO Auto-generated method stub
		try {
			FileWriter writer = new FileWriter(file);
			String text = this.taBuecherliste.getText( );
			writer.write(text);
			writer.flush();
			writer.close();
		}
		catch (IOException e)
		{
			e.printStackTrace( );
		}
	}
public void load()
	{
		final JFileChooser fc = new JFileChooser();
		int returnVal = fc.showOpenDialog(getParent());

		if (returnVal == JFileChooser.APPROVE_OPTION)
		{
			File file = fc.getSelectedFile();
			showText(file);
		}

	}

public void showText(File file)
	{
		StringBuffer buf = new StringBuffer();
		if (file.exists())
		{
			try {
				BufferedReader reader = new BufferedReader(new FileReader(file));
				String line = "";
				while ((line = reader.readLine()) != null){
					buf.append(line+"\n");
				}
				reader.close();

			}
			catch (FileNotFoundException e)
			{
				e.printStackTrace();
			}
			catch (IOException e) {
				e.printStackTrace();
			}
		}
		this.taBuecherliste.setText(buf.toString());
}