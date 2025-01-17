/*
 Copyright 2021 Adobe. All rights reserved.
 This file is licensed to you under the Apache License, Version 2.0 (the "License");
 you may not use this file except in compliance with the License. You may obtain a copy
 of the License at http://www.apache.org/licenses/LICENSE-2.0
 Unless required by applicable law or agreed to in writing, software distributed under
 the License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR REPRESENTATIONS
 OF ANY KIND, either express or implied. See the License for the specific language
 governing permissions and limitations under the License.
 */

package com.adobe.marketing.edge.identity.app.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import com.adobe.marketing.edge.identity.app.R
import com.adobe.marketing.mobile.Assurance

class AssuranceFragment : Fragment() {

    override fun onCreateView(
            inflater: LayoutInflater,
            container: ViewGroup?,
            savedInstanceState: Bundle?
    ): View? {
        val root = inflater.inflate(R.layout.fragment_assurance, container, false)

       root.findViewById<Button>(R.id.btn_assurance_connect).setOnClickListener {
           val connectUrl = root.findViewById<EditText>(R.id.text_session_url).text.toString()
           if (!connectUrl.isNullOrBlank()) {
               Assurance.startSession(connectUrl)
           }
       }
        return root
    }
}