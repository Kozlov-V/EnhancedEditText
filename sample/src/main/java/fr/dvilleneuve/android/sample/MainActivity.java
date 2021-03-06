/**
 * Copyright 2013 Damien Villeneuve
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * It uses Iconify by Joan Zapata, licensed under Apache License version 2, which is compatible
 * with this library's license.
 */
package fr.dvilleneuve.android.sample;

import android.app.Activity;
import android.graphics.Color;
import android.widget.EnhancedEditText;
import com.googlecode.androidannotations.annotations.AfterViews;
import com.googlecode.androidannotations.annotations.Click;
import com.googlecode.androidannotations.annotations.EActivity;
import com.googlecode.androidannotations.annotations.ViewById;
import com.joanzapata.android.iconify.Iconify;

@EActivity(R.layout.activity_main)
public class MainActivity extends Activity {

	@ViewById
	EnhancedEditText edittext1, edittext2, edittext3;

	@AfterViews
	void init() {
		edittext1.setPrefixColor(Color.LTGRAY);
		edittext3.setPrefixColors(R.drawable.text_color);
		edittext3.setSuffixColorRes(R.color.text_color_red);
	}

	@Click
	void buttonToggleDrawablesClicked() {
		if (edittext3.getPrefixDrawable() == null)
			edittext3.setPrefixTextRes(R.string.activity_main_edittext3_prefix);
		else
			edittext3.setPrefixText(null);

		if (edittext3.getSuffixDrawable() == null)
			edittext3.setSuffixIcon(Iconify.IconValue.icon_circle_arrow_right);
		else
			edittext3.setSuffixIcon(null);
	}

}