package de.yaacc;

import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

public class BrowseItemClickListener implements OnItemClickListener {


	@Override
	public void onItemClick(AdapterView<?> listView, View arg1, int position, long id) {

		ListView a = (ListView) listView.findViewById(R.id.deviceList);
		BrowseItemAdapter adapter = (BrowseItemAdapter) listView.getAdapter();
		
		// if the current id is null, go back to the top level
		String newObjectId = adapter.getFolder(position).getId()==null?"0":adapter.getFolder(position).getId();
		
		BrowseItemAdapter bItemAdapter = new BrowseItemAdapter(listView.getContext(),newObjectId);
    	a.setAdapter(bItemAdapter);
    	
    	BrowseItemClickListener bItemClickListener = new BrowseItemClickListener();
    	a.setOnItemClickListener(bItemClickListener);
				    	
	}

}